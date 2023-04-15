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
}
.el-container {
    height: 100%;
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
    height: 100%;
    background-color: #f4f5f5;
}
.el-card__body{
    padding: 10px !important;
}
.hover-change:hover{
    cursor: pointer;
    background-color: #fafafa !important;
}
</style>
