//首页签到
<template>
<el-card shadow="never">
<el-row>
  <el-col class="icon-box" :span="3">
      <icon-base :width="25" :height="25" ><Icon-Calendar/></icon-base>
  </el-col>
  <el-col :offset="1" class="span-box" :span="8">
      <span>晚上好!</span>
  </el-col>
  <el-col :offset="2" class="btn-box" :span="8"><el-button >去签到</el-button></el-col>
</el-row>
   <el-row>
     <el-col class="sign-txt" :offset="5"><span >点亮你在社区的每一天</span></el-col>
   </el-row>
</el-card>
</template>

<script>
import  IconBase from '/src/components/icon/IconBase.vue'
import  IconCalendar from '/src/components/icon/IconCalendar.vue'
export default {
    components:{
        IconBase,IconCalendar
    }
}
</script>

<style scoped>
.el-card{
    width: 250px;
    height: 100px;
}
.icon-box{
    margin: 10px 0 0 10px;
}
.span-box{
    margin-top: 10px;
    color: #1d2129;
    font-size: 18px;
    font-weight: 500
}
.btn-box{
    margin-top: 10px;
    
}
.el-button{
    color: #1e80ff;
    border-radius: 50px;
    font-weight: 400;
    border: 1px solid #1e80ff;
}
.sign-txt{
    margin-top: 5px;
    color: #4e5969;
    font-size: 14px;
    font-weight: 400;
}
</style>
