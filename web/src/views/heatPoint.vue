<template>
    <div class="top-contain">
        <el-row>
            <el-col :span="3" :offset="2" class="left-menu">
                <left-menu></left-menu>
            </el-col>
            <el-col :span="12">
                <el-card shadow="never" class="input-card">
                    <el-input show-word-limit maxlength="1000" :input-style="inputStyle" resize="none" v-model="TopicTxt"
                        :autosize="{ minRows: 4, maxRows: 8 }" type="textarea"
                        placeholder="快和掘友一起分享新鲜事！告诉你个小秘密，发布沸点时添加圈子和话题会被更多掘友看到哦～" />
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
                <div class="baseview-box">
                    <base-view />
                </div>
            </el-col>
            <el-col :span="5" class="hidden-md-and-down">
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
import LeftMenu from '@/components/base/LeftMenu.vue'
import 'element-plus/theme-chalk/display.css'
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
        BaseView,
        LeftMenu
    },
    data() {
        return {

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
.top-contain{
    margin-top: 20px;
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

.left-menu{
    margin-right: 20px;
    min-width: 150px;
}
.baseview-box{
    margin-top: 10px;
}

</style>
