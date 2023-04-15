<template>
<div class="common-layout">
    <el-container>
        <el-aside width="23%">
            <el-card class="box-card" shadow="never">
                <el-menu @select="menuSelect" default-active="3" class="el-menu-vertical-demo" @open="handleOpen" @close="handleClose">
                    <el-menu-item index="0">
                        <icon-base :iconColor="color[0]" class="icon-box" icon-name="write">
                            <icon-new />
                        </icon-base>
                        <span>最新</span>
                    </el-menu-item>
                    <el-menu-item index="1">
                        <icon-base :iconColor="color[1]" class="icon-box" icon-name="write">
                            <icon-heat />
                        </icon-base>
                        <span>热门</span>
                    </el-menu-item>
                    <el-menu-item index="2">
                        <icon-base :iconColor="color[2]" class="icon-box" icon-name="write">
                            <icon-follow />
                        </icon-base>
                        <span>关注</span>
                    </el-menu-item>
                    <el-menu-item index="3">
                        <icon-base :iconColor="color[3]" class="icon-box" icon-name="write">
                            <icon-circle />
                        </icon-base>
                        <span>我的圈子</span>
                    </el-menu-item>
                    <el-menu-item index="4">
                        <icon-base :iconColor="color[4]" class="icon-box" icon-name="write">
                            <icon-recomment />
                        </icon-base>
                        <span>推荐圈子</span>
                    </el-menu-item>
                    <el-menu-item index="7">
                        <el-icon>
                            <icon-menu />
                        </el-icon>
                        <span class="menu-children">内推招聘广场</span>
                    </el-menu-item>
                    <el-menu-item index="8">
                        <el-icon>
                            <icon-menu />
                        </el-icon>
                        <span class="menu-children">技术交流圈</span>
                    </el-menu-item>
                    <el-menu-item index="9">
                        <el-icon>
                            <icon-menu />
                        </el-icon>
                        <span class="menu-children">据友请回答</span>
                    </el-menu-item>
                    <el-menu-item index="21">
                        <el-icon>
                            <icon-menu />
                        </el-icon>
                        <span class="menu-children">树洞一下</span>
                    </el-menu-item>
                    <el-menu-item index="12">
                        <el-icon>
                            <icon-menu />
                        </el-icon>
                        <span class="menu-children">上班摸鱼</span>
                    </el-menu-item>
                    <el-menu-item index="112">
                        <el-icon>
                            <icon-menu />
                        </el-icon>
                        <span class="menu-children">更多</span>
                    </el-menu-item>
                </el-menu>
            </el-card>
        </el-aside>
        <el-main>
            <div class="card-box">
                <el-row>
                    <el-col :span="15">
                        <el-card shadow="never" class="input-card">
                            <el-input show-word-limit maxlength="1000" :input-style="inputStyle" resize="none" v-model="TopicTxt" :autosize="{ minRows: 4, maxRows: 8 }" type="textarea" placeholder="快和掘友一起分享新鲜事！告诉你个小秘密，发布沸点时添加圈子和话题会被更多掘友看到哦～" />
                            <el-row style="margin-top: 15px">
                                <el-col :span="3" class="icon-style">
                                    <el-icon>
                                        <IconExpression />
                                    </el-icon>
                                    <span>表情</span>
                                </el-col>
                                <el-col :span="3" class="icon-style">
                                    <el-icon>
                                        <IconImage />
                                    </el-icon>
                                    <span>图片</span>
                                </el-col>
                                <el-col :span="3" class="icon-style">
                                    <el-icon>
                                        <IconLink />
                                    </el-icon>
                                    <span>链接</span>
                                </el-col>
                                <el-col :span="2" class="icon-style">
                                    <el-icon>
                                        <Icon-topic />
                                    </el-icon>
                                    <span>话题</span>
                                </el-col>
                                <el-col :span="2" :offset="11">
                                    <el-button disabled type="info">发布</el-button>
                                </el-col>
                            </el-row>
                        </el-card>
                    </el-col>
                    <el-col :span="6">
                        <el-card class="user-box" shadow="never">
                            <el-row>
                                <el-col :span="4">
                                    <el-avatar style="margin:8px 6px" shape="square" :size="50" :src="circleUrl" />
                                </el-col>
                                <el-col class="username-css" :span="10">
                                    <span>La fe</span>
                                </el-col>
                            </el-row>
                            <el-divider style="margin:10px 0" />
                            <el-row class="user-number">
                                <el-col :offset="1" :span="5">
                                    <span>0</span>
                                </el-col>
                                <el-col :span="5">
                                    <span>0</span>
                                </el-col>
                                <el-col :span="5">
                                    <span>0</span>
                                </el-col>
                                <el-col :span="5">
                                    <span>0</span>
                                </el-col>
                            </el-row>
                            <el-row class="user-fen">
                                <el-col :offset="1" :span="5">
                                    <span>沸点</span>
                                </el-col>
                                <el-col :span="5">
                                    <span>圈子</span>
                                </el-col>
                                <el-col :span="5">
                                    <span>关注</span>
                                </el-col>
                                <el-col :span="5">
                                    <span>关注者</span>
                                </el-col>
                            </el-row>
                        </el-card>
                    </el-col>
                </el-row>
                <el-row style="margin-top:10px">
                    <el-col :span="15">
                        <base-view />
                    </el-col>
                </el-row>
            </div>
        </el-main>
    </el-container>
</div>
</template>

<script>
import IconBase from '../components/icon/IconBase.vue'
import IconNew from '../components/icon/IconNew.vue'
import IconHeat from '../components/icon/IconHeat.vue'
import IconFollow from '../components/icon/IconFollow.vue'
import IconCircle from '../components/icon/IconCircle.vue'
import IconRecomment from '../components/icon/IconRecomment.vue'
import IconExpression from '../components/icon/IconExpression.vue'
import IconLink from '../components/icon/IconLink.vue'
import IconImage from '../components/icon/IconImage.vue'
import IconTopic from '../components/icon/IconTopic.vue'
import BaseView from '../components/base/BaseView.vue'
import qq from '../assets/images/qq.png'
export default {
    components: {
        IconBase,
        IconNew,
        IconHeat,
        IconFollow,
        IconCircle,
        IconRecomment,
        IconExpression,
        IconLink,
        IconImage,
        IconTopic,
        BaseView
    },
    data() {
        return {
            color: ['currentColor', '#8a919f', '#8a919f', '#8a919f', '#8a919f'],
            TopicTxt: '',
            inputStyle: {
                'background-color': '#f2f3f5'
            },
            circleUrl: qq
        }
    },
    methods: {
        menuSelect(index, indexPath, item) {
            console.log(index, indexPath, item)
            this.color = ['#8a919f', '#8a919f', '#8a919f', '#8a919f', '#8a919f']
            this.color[index] = 'currentColor'
        }
    }
}
</script>

<style scoped>
.el-menu-item {
    height: 44px;
    font-size: 16px;
}

.el-menu {
    border: 0;
}

.input-card {
    padding: 10px;
    height: 200px;
}

.card-box {
    border-radius: 4px !important;
    padding: 0px;
}

.box-card {
    width: 200px;
    margin: 20px 0 0 150px !important;
}

.icon-box {
    margin: 0 10px 0 -10px;
}

.menu-children {
    font-size: 14px;
    color: #8a919f;
    margin-left: -10px;
}

/* 表情 等图标样式 */
.icon-style {
    font-size: 14px;
    color: #4e5969;
    cursor: pointer;
}

.icon-style:hover {
    color: #1e80ff;
}

.user-box {
    margin: 0 0 0 20px;
    height: 180px;
}

.username-css {
    color: #252933;
    font-size: 16px;
    font-weight: 500;
    margin: 20px 0 0 30px;
}

.user-number {
    font-weight: 500;
    font-size: 16px;
    line-height: 28px;
    color: #252933;
    white-space: nowrap;
}

/* 沸点、圈子 */
.user-fen {
    font-size: 14px;
    line-height: 24px;
    color: #8a919f;
    white-space: nowrap;
}
</style>
