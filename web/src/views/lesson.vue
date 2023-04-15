<template>
<div class="index-container">
    <el-container>
        <!-- 菜单 -->
        <el-header>
            <menu-view></menu-view>
        </el-header>
        <el-container>
            <el-aside></el-aside>
            <el-main>
                <lesson-view/>
            </el-main>
        </el-container>
    </el-container>

</div>
</template>

<script>
import MenuView from '../components/base/MenuView.vue'
import LessonView from '../components/base/LessonView.vue'
export default {
    components: {
        MenuView,LessonView
    },
}
</script>

<style scoped>
.index-container {
    height: 100%;
}
.el-header {
    --el-header-height: 45px;
}
</style>
