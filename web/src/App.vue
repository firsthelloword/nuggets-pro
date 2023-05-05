<template>
<div id="app">
    <router-view />
</div>
</template>

<style>
#app,
html,
body {
    height: 100%;
    width: 100%;
    padding: 0;
    margin: 0;
}
.el-container {
    height: 100%;
    width: 100%;
    margin: 0;
}

.el-tabs__item {
    font-weight: 400 !important;
}

.el-dialog {
    display: flex;
    flex-direction: column;
    margin: 0 !important;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    /*height:600px;*/
    max-height: calc(100% - 30px);
    max-width: calc(100% - 30px);
}
.el-aside,
.el-main {
    padding: 0 !important;
    height: 100%;
    background-color: #f4f5f5;
}
.hover-change:hover{
    cursor: pointer;
    background-color: #fafafa !important;
}

.el-menu{
    user-select: none;
}
.el-header{
    padding: 0 !important;
}
</style>
