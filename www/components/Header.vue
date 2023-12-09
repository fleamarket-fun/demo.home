<template>
  <div class="mb-16">
    <el-menu
        mode="horizontal"
        :ellipsis="false"
    >
      <el-menu-item index="0">
        <img
            style="width: 100px"
            src="/static/images/logo.png"
            alt="Element logo"
        />
      </el-menu-item>
      <div class="flex-grow" />
      <el-menu-item index="1">网站首页</el-menu-item>
      <el-menu-item index="1">关于我们</el-menu-item>
      <el-menu-item index="1">产品展示</el-menu-item>
      <el-menu-item index="1">新闻动态</el-menu-item>
      <el-menu-item index="1">资料下载</el-menu-item>
      <el-menu-item index="1">客户案例</el-menu-item>
      <el-menu-item index="1">加入我们</el-menu-item>
    </el-menu>
  </div>
</template>
<style>
.flex-grow {
  flex-grow: 1;
}
</style>
<script setup lang="ts">
</script>