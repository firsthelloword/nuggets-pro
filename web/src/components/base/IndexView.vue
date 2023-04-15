//首页显示
<template>
<el-car shadow="never" class="view-card">
    <el-row class="view-box">
        <el-col :span="18">
            <el-row>
                <span class="user-name">掘金酱</span>
                <span class="user-explain">| 五天前｜Java · 后端</span>
            </el-row>
            <el-row>
                <span class="article-title">装了这几个IDEA插件，基本上一站式开发了！</span>
            </el-row>
            <el-row>
                <span class="artile-context truncate">前言 前几天有社区小伙伴私聊我，问我都用哪些IDEA插件，我的IDEA的主题看起来不错。 作为一个开源作者，每周要code大量的代码，提升日常工作效率是我一直追求的，在众多的IDEA插件中，我独钟爱这</span>
            </el-row>
            <el-row class="bottom-box">
                <i class="icon-box fa fa-eye"></i>
                <span class="icon-title">1319</span>
                <i class="icon-box fa fa-thumbs-o-up"></i>
                <span class="icon-title">14</span>
                <i class="icon-box fa fa-comment-o"></i>
                <span class="icon-title">评论</span>
            </el-row>
        </el-col>
        <el-col :offset="1" :span="5">
            <el-image class="article-image" :src="url" />
        </el-col>
    </el-row>

</el-car>
</template>

<script>
export default {
    
    data() {
        return {
            url: 'https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg'
        }
    }
}
</script>

<style scoped>
.view-box {
    padding: 15px 0 10px 20px;
}

.user-name {
    padding-right: 10px;
    font-size: 13px;
    line-height: 22px;
    color: #4e5969;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    word-break: break-all;
}

.user-explain {
    line-height: 22px;
    font-size: 13px;
    color: #86909c;
}

.article-title {
    margin: 10px 0;
    font-weight: 700;
    font-size: 16px;
    line-height: 24px;
    color: #1d2129;
}

.artile-context {
    color: #86909c;
    font-size: 13px;
    line-height: 22px;
}

.article-image {
    margin-top: 20px;
    width: 120px;
    height: 80px;
}

.view-card:hover {
    cursor: pointer;
}
.bottom-box {
    margin-top: 10px;
    color: #4e5969;
    font-size: 13px;
}
.icon-box{
    margin: 0 5px 0 0;
}
.icon-title{
    margin: -3px 25px 0 0;
}
</style>
