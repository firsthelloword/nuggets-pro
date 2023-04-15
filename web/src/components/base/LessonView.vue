//展示课程组件
<template>
<el-card shadow="never" >
    <el-row>
        <el-col :span="5">
            <el-image class="shadow-xl" style="width: 100px; height: 140px" :src="url" :fit="fit"></el-image>
        </el-col>
        <el-col :span="19">
            <el-row class="image-title"><span>Flutter 布局探索 - 薪火相传</span></el-row>
            <el-row class="image-explain"><span>由浅入深，从源码探索 Flutter 布局原理~</span></el-row>
            <el-row>
                <el-col :span="2">
                    <el-avatar :size="26" :src="advatorUrl"></el-avatar>
                </el-col>
                <el-col :span="20">
                    <span>张风捷特烈</span>
                    <icon-base style="margin:0 0 -4px 5px" :width="30" :height="22">
                       <IconRank/>
                    </icon-base>
                    <span class="author-content">
                        万花过尽知无物 @ 编程之王
                    </span>
                </el-col>
            </el-row>
            <el-row>
                <span class="menoy-css">¥ 3.5</span>
                <span class="lesson-heat">16小节 · 347人已购买</span>
            </el-row>
        </el-col>
    </el-row>
</el-card>
</template>

<script>
import IconBase from '../icon/IconBase.vue'
import IconRank from '../icon/IconRank1.vue' 
export default {
    components: {
        IconBase,
        IconRank
    },
    data() {
        return {
            url: 'https://p9-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/c67ae2a3a05941beb3c6aa09f70e6fcd~tplv-k3u1fbpfcp-no-mark:280:280:200:280.awebp',
            advatorUrl: 'https://p9-passport.byteacctimg.com/img/user-avatar/5b2b7b85d1c818fa71d9e2e8ba944a44~300x300.image'
        }
    }
}
</script>

<style scoped>
.el-card {
    margin: -10px 0 10px 10%;
    width: 50%;
}

/* 图片标题 */
.image-title {
    color: #2e3135;
    font-size: 20px;
    font-weight: 400;
}

.image-explain {
    font-size: 14px;
    margin: 5px 0;
    line-height: 20px;
    height: 20px;
    overflow: hidden;
    text-overflow: ellipsis;
    color: #71777c;
}

.author-content {
    color: #71777c;
    font-size: 14px;
}
.menoy-css{
  color: #ed7b11;
    font-size: 18px;
}
.lesson-heat{
   padding-top: 5px;
    opacity: .6;
    font-size: 13px;
    color: #71777c;
}
.el-card{
  border: 0;
  cursor: pointer;
}
.el-card:hover{
  background-color: #f6f8f8;
}
</style>
