<template>
  <div>
    <el-card class="box-card" shadow="never">
                <el-menu @select="menuSelect" default-active="3"  @open="handleOpen" @close="handleClose">
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
  </div>
</template>

<script>
export default {
    data(){
        return {
            color: ['currentColor', '#8a919f', '#8a919f', '#8a919f', '#8a919f'],
        }
    }
}
</script>

<style>

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
</style>