<!-- 首页 -->
<template>
    <div class="index-container">
        <el-container>
            <!-- 菜单 -->
            <!-- <el-header>
                <menu-view></menu-view>
            </el-header> -->
            <el-main class="main-contain">
                <el-row>
                    <el-col :offset="2" :span="3" class="left-contain">
                        <left-menu></left-menu>
                    </el-col>
                    <el-col :span="12">
                        <el-card class="box-main" shadow="never">
                            <el-row>
                                <el-tabs v-model="activeName" @tab-click="handleClick">
                                    <el-button class="card-btn" type="text">推荐</el-button>
                                    <span class="separator-style">|</span>
                                    <el-button class=card-btn type="text">最新</el-button>
                                    <span class="separator-style">|</span>
                                    <el-button class="card-btn" type="text" @click="hostClick">热榜</el-button>
                                </el-tabs>
                                <el-select v-if="activeName == '热榜'" v-model="date" class="date-option" size="small">
                                    <el-option label="3天内" value="1" />
                                    <el-option label="7天内" value="1" />
                                    <el-option label="30天内" value="1" />
                                    <el-option label="全部" value="1" />
                                </el-select>
                                <el-divider class="divider" />
                            </el-row>
                            <div class="view-box">
                                <IndexView />
                            </div>
                        </el-card>
                    </el-col>
                    <el-col class="sign-box hidden-md-and-down" :span="5">
                        <sign-view></sign-view>
                        <author-view></author-view>
                    </el-col>
                </el-row>
            </el-main>
        </el-container>

    </div>
</template>

<script>
import MenuView from '../components/base/MenuView.vue'
import IndexView from '../components/base/IndexView.vue'
import SignView from '../components/base/SignView.vue'
import AuthorView from '../components/base/AuthorView.vue'
import LeftMenu from '@/components/base/LeftMenu.vue'
import 'element-plus/theme-chalk/display.css'
export default {
    components: {
        AuthorView,
        MenuView,
        IndexView,
        SignView,
        LeftMenu
    },
    data() {
        return {
            activeName: "推荐",
            date: "3天内",
            hello: "<span style='color:red'>张</span>"
        }
    },
    methods: {
        hostClick() {
            this.activeName = "热榜"
        }
    }
}
</script>

<style scoped>
.main-contain{
    margin-top: 20px;
}
.left-contain{
    min-width: 150px;
    width: 100%;
    margin-right: 20px;
}

.card-btn {
    margin: -10px 10px 0 10px;
    color: #71777c;
    font-weight: 400;
}

.divider {
    margin: 10px 0 0 -10px;
}

.separator-style {
    cursor: pointer;
    color: #f4f5f5;
}

.el-link {
    padding: 0 15px 0 15px;
}

.el-header {
    --el-header-height: 45px;
}

.box-main {
    min-width: 600px;
    width: 100%;
    height: 90%;
    margin: 0;
    padding: 0 !important;
}

.el-radio-button {
    border: 0 !important;
}

.index-container {
    height: 100%;
}

.el-main {
    padding: 10px;

}

.date-option {
    width: 90px;
    margin: 16px 10px 0 0;

}

.el-select-dropdown__item {
    font-size: 5px;
}

.view-box {
    margin-left: -10px;
}

.view-box:hover {
    background-color: #f9f9f9;
}

.sign-box {
    width: 200px;
    margin-left: 20px;
}
</style>
