//菜单组件
<template>
<el-menu :default-active="activeIndex" mode="horizontal" @select="handleSelect">
    <el-menu-item v-for="menu in menus" :key="menu.text" :index="menu.text">{{menu.value}}</el-menu-item>
</el-menu>
</template>

<script>
export default {
    props: {
        menus: {
            type: Array,
            default: [{
                    text: '综合',
                    value: '综合'
                },
                {
                    text: '后端',
                    value: '后端'
                },
                {
                    text: '前端',
                    value: '前端'
                },
                {
                    text: 'Android',
                    value: 'Android'
                },
                {
                    text: 'iOS',
                    value: 'iOS'
                },
                {
                    text: '人工智能',
                    value: '人工智能'
                },
                {
                    text: '开发工具',
                    value: '开发工具'
                },
                {
                    text: '代码人生',
                    value: '代码人生'
                },
                {
                    text: '阅读',
                    value: '阅读'
                },
            ]
        }
    },
    data() {
        return {

        }
    }
}
</script>

<style scoped>
.el-menu {
    border: 0;
    margin: 0 20% 0 20%;
    height: 45px;

}
.el-menu-item {
    color: #71777c !important;
    font-size: 14px;
}
</style>
