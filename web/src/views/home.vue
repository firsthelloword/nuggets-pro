<template>
<div class="common-layout">
    <el-container>
        <el-header>
            <el-menu router :default-active="activeIndex" mode="horizontal" @select="handleSelect">
                <img class="logo-class" src="../assets/images/logo.svg" alt="稀土掘金">
                <el-menu-item index="index">首页</el-menu-item>
                <el-menu-item index="heatPoint">沸点</el-menu-item>
                <el-menu-item index="lesson">课程</el-menu-item>
                <el-menu-item index="#">直播</el-menu-item>
                <el-menu-item index="7">资讯</el-menu-item>
                <el-menu-item index="8">活动</el-menu-item>
                <el-sub-menu>
                    <template #title>开放社区</template>
                    <el-menu-item index="9-1">青训营社区</el-menu-item>
                </el-sub-menu>
                <el-menu-item index="10">商城</el-menu-item>
                <el-menu-item index="11">APP</el-menu-item>
                <el-menu-item index="12">插件</el-menu-item>
                <div class="menu-search">
                    <el-input v-model="input3" placeholder="搜索稀土掘金">
                        <template #append>
                            <el-icon>
                                <search />
                            </el-icon>
                        </template>
                    </el-input>
                </div>

                <el-dropdown split-button type="primary" class="menu-dropdown">
                    创作者中心
                    <template #dropdown>
                        <el-dropdown-menu>
                            <el-dropdown-item>写文章</el-dropdown-item>
                            <el-dropdown-item>发沸点</el-dropdown-item>
                        </el-dropdown-menu>
                    </template>
                </el-dropdown>

                <el-button class="menu-button" @click="showLogin">登录</el-button>
                <login :v-if="loginVisible"></login>
            </el-menu>
        </el-header>
        <div class="home-container">
            <router-view />
        </div>

        <el-dialog v-model="loginVisible" :title="loginTitle" width="22%">
            <img @click="imgChange" class="login-image" :src="url" />
            <el-form :rules="loginRules" :label-position="labelPosition" :model="loginForm" style="max-width: 460px">
                <el-input @focus="accountFocus" :placeholder="accountPlaceholder" v-model="loginForm.account" />
                <el-input v-if='isPassword' @focus="passwordFocus" placeholder="请输入密码" v-model="loginForm.password" />
                <el-input v-else v-model="input2" placeholder="验证码">
                    <template #append>
                        <el-link :underline="false" @click="sendCode" :disabled="isDisable">{{codeTitle}}</el-link>
                    </template>
                </el-input>

                <el-button @click="login" class="login-btn" type="primary">登陆</el-button>
                <el-row style="width: 100%">
                    <el-col :span="10">
                        <el-link @click="isPassword = !isPassword" :underline="false" class="login-link" type="primary">{{loginWay}}</el-link>
                    </el-col>
                    <el-col :offset="6" :span="8">
                        <el-link :underline="false" class="login-link" type="primary">忘记密码</el-link>
                    </el-col>
                </el-row>
            </el-form>
        </el-dialog>
    </el-container>
</div>
</template>

<script>
import loginLogo from '../assets/images/login-logo.svg'
import loginAccount from '../assets/images/login-account.svg'
import loginPassword from '../assets/images/login-password.svg'
import {
    login,
    SendCode
} from '@/api/login'
export default {
    components: {

    },
    data() {
        var accountRules = (rule, value, callback) => {
            if (!this.loginForm.account) {
                return callback(new Error('账号不能为空'))
            }
            const regEmail = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\.[a-zA-Z0-9_-])+/
            const regMobile = /^(0|86|17951)?(13[0-9]|15[012356789]|17[678]|18[0-9]|14[57])[0-9]{8}$/
            if (!this.isPassword && !regEmail.test(this.loginForm.account)) {
                return callback(new Error('邮箱格式错误！'))
            }
            if (!regEmail.test(this.loginForm.account) && !regMobile.test(this.loginForm.account)) {
                return callback(new Error('手机或邮箱格式错误！'))
            }
            callback()
        }
        return {
            loginForm: {
                account: '',
                password: ''
            },
            loginVisible: false,
            url: loginLogo,
            isPassword: true,
            loginTitle: "账密登陆",
            isDisable: false,
            codeTitle: "获取验证码",
            accountPlaceholder: '邮箱/手机号',
            loginRules: {
                account: [{
                    validator: accountRules,
                    trigger: 'blur'
                }],
                password: [{
                    required: true,
                    message: '请输入密码',
                    trigger: 'blur'
                }]
            }
        }
    },
    computed: {
        loginWay() {
            if (this.isPassword) {
                this.loginTitle = "账密登陆"
                this.accountPlaceholder = "邮箱/手机"
                return "验证码登陆"
            } else {
                this.loginTitle = "验证码登陆"
                this.accountPlaceholder = "邮箱"
                return "密码登陆"
            }
        }
    },
    methods: {
        showLogin() {
            this.loginVisible = true
            this.login().then()
        },
        imgChange() {
            this.url = loginLogo
        },
        accountFocus() {
            this.url = loginAccount
        },
        passwordFocus() {
            this.url = loginPassword
        },
        login() {
            console.log(process.env.VUE_APP_BASE_API_URL)
            login(this.loginForm).then(resp => {
                console.log(resp)
            })
        },
        sendCode() {
            const regEmail = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\.[a-zA-Z0-9_-])+/
            if (!regEmail.test(this.loginForm.account)) {
                this.$notify({
                    message: '邮箱格式错误！',
                    type: 'warning',
                })
                return
            }
            SendCode(this.loginForm.account).then(res => {
                console.log(res)
                this.isDisable = true;
                var index = 60;
                var time = setInterval(() => {
                    this.codeTitle = index--
                    if (this.codeTitle == 0) {
                        this.codeTitle = "获取验证码"
                        this.isDisable = false
                        clearInterval(time);
                    }
                }, 1000)
            })

        }
    }
}
</script>

<style scoped>
.login-link {
    margin-top: 15px;
    width: 80px;
}

.login-btn {
    margin-top: 10px;
    width: 100%;
}

.login-image {
    width: 8rem;
    margin-top: -48%;
    position: absolute;
    left: 30%;
}

.el-input {
    margin: 5px 0;
}

.el-form {
    margin-top: -30px;
}

.common-layout {
    height: 100%;
}

.el-header {
    margin: 0 !important;
}

.home-container {
    height: 100%;
}

.logo-class {
    margin: auto;
    display: flex;
    align-items: center;
    width: 107px;
    height: 22px;
}

.menu-search {
    display: flex;
    align-items: center;
    margin: auto;
    padding: auto;
}

.menu-dropdown {
    background-color: #1e80ff;
    display: flex;
    margin: auto;
    padding: auto;
    align-items: center;
}

.menu-button {
    align-items: center;
    margin: auto;
    padding: auto;
    color: #007fff !important;
    background: rgba(30, 128, 255, .05) !important;
    font-size: 14px;
    height: 2rem !important;
    font-weight: 400 !important;
}

.menu-list {
    margin-right: 50px !important;
}
</style>
