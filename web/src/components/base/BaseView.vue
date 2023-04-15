//显示动态组件
<template>
<div>
    <el-card shadow="never">
        <el-row>
            <el-col :span="2">
                <div class="avatar-box">
                    <el-avatar :size="50" :src="circleUrl" />
                </div>
            </el-col>
            <el-col :span="8">
                <el-row class="name-box">
                    <el-col :span="4"><span>Name</span></el-col>
                </el-row>
                <el-row class="position-box">
                    <el-col :span="16"><span>首席工程师 · 14分钟前</span></el-col>
                </el-row>
                <el-row class="content-box">
                    <el-col><span>vue 真是太好玩了</span></el-col>
                </el-row>
            </el-col>
        </el-row>
        <el-divider style="margin:20px 0 10px 0" />
        <el-row>
            <el-col class="interactive-box" :span="8">
                <icon-base :width="17" :height="17" class="icon-box">
                    <IconShare />
                </icon-base>
                <span>分享</span>
            </el-col>
            <el-col class="interactive-box" :span="8">
               <icon-base :width="17" :height="17" class="icon-box">
                    <IconComment />
               </icon-base>
                <span>评论</span>
            </el-col>
            <el-col class="interactive-box" :span="8">
                <icon-base :width="17" :height="17" class="icon-box">
                    <IconLike />
                </icon-base>
                <span>点赞</span>
            </el-col>
        </el-row>
    </el-card>

</div>
</template>

<script>
import IconBase from '../icon/IconBase.vue'
import IconShare from '../icon/IconShare.vue'
import IconLike from '../icon/IconLike.vue'
import IconComment from '../icon/IconComment.vue'

export default {
    components: {
        IconComment,
        IconLike,
        IconShare,
        IconBase
    },
    data() {
        return {
            url: 'https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png'
        }
    }
}
</script>

<style scoped>
.avatar-box {
    margin: 10px 0 0 10px;
}

.name-box {
    font-size: 16px;
    font-weight: 500;
    margin: 10px 0 0 13px;
}

.position-box {
    font-size: 14px;
    color: #8a919f;
    margin: 0 0 0 13px;
}

.content-box {
    margin: 15px 0 0 14px;
    font-size: 14px;
    color: #17181a;
}

/* 评论、点赞 */
.interactive-box {
    color: #86909c;
    cursor: pointer;
    font-size: 12px;
    text-align: center;
}
.interactive-box:hover{
    color: #afb8c4;
}
/* 图标样式 */
.icon-box {
    margin: 0 2px -4px 0;
}
</style>
