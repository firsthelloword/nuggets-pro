//首页作者榜单
<template>
<el-card shadow="never">
    <el-row class="title-box">
        <span>🎖️作者榜</span>
    </el-row>
    <el-divider />
    <el-row class="container-box hover-change">
        <el-col :span="5" :offset="1">
            <el-avatar :size="46" :src="circleUrl" />
        </el-col>
        <el-col :span="5" class="username-box">
            <span>Name</span>
        </el-col>
        <el-col class="rank-box" :span="5">
             <base-view>
                <icon-rank-1 :width="23" :height="14"></icon-rank-1>
            </base-view>
        </el-col>
    </el-row>
    <el-row class="container-box hover-change">
        <el-col :span="5" :offset="1">
            <el-avatar :size="46" :src="circleUrl" />
        </el-col>
        <el-col :span="5" class="username-box">
            <span>Name</span>
        </el-col>
        <el-col class="rank-box" :span="5">
             <base-view>
                <icon-rank-1 :width="23" :height="14"></icon-rank-1>
            </base-view>
        </el-col>
    </el-row>
    <el-row class="container-box hover-change">
        <el-col :span="5" :offset="1">
            <el-avatar :size="46" :src="circleUrl" />
        </el-col>
        <el-col :span="5" class="username-box">
            <span>Name</span>
        </el-col>
        <el-col class="rank-box" :span="5">
             <base-view>
                <icon-rank-1 :width="23" :height="14"></icon-rank-1>
            </base-view>
        </el-col>
    </el-row>
    <el-divider />
    <el-row class="btn-box">
      <el-col :span="24">
          <el-button class="hover-change">完整榜单 ></el-button>
      </el-col>
    </el-row>
    
</el-card>
</template>

<script>
import IconBase from '../icon/IconBase.vue'
import IconRank1 from '../icon/IconRank1.vue'
export default {
    components: {
        IconRank1,
        IconBase
    },
    data() {
        return {
            circleUrl: 'https://p6-passport.byteacctimg.com/img/user-avatar/8e6d13ed687541e576f001e5a89e4244~300x300.image'
        }
    }
}
</script>

<style scoped>
.title-box {
    font-size: 14px;
    padding-left: 10px;
}

.el-card {
    margin-top: 20px;
    width: 250px;
}

.el-divider {
    width: 250px;
    padding: 0;
    margin: 10px 0 10px -10px;
}
.rank-box{
    margin: 15px 0 0 10px;
}
.username-box{
    margin: 10px 0 0 5px;
}
.container-box{
    width: 250px;
    margin: 0 10px 0 -10px;
    padding: 5px 10px;
}
.el-button{
    height: 100%;
    width: 100%;
    color: #007fff;
    padding-left: 20px;
    display: flex;
    border: 0;
}
.btn-box{
    height: 40px;
    width: 250px;
     margin: -10px 0 -10px -10px;
}
</style>
