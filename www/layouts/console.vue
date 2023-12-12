<template>
  <div class="common-layout">
    <el-container>
      <el-aside width="250px">
        <el-row>
          <el-col style="padding: 24px;">
            <table>
              <tr>
                <td rowspan="2" >
                  <el-avatar class="mr-6" :size="50" src="https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png"/>
                </td>
                <td>管理员</td>
              </tr>
              <tr>
                <td>
                  <el-text size="small">退出登录</el-text>
                </td>
              </tr>
            </table>
          </el-col>
        </el-row>
        <el-menu
            default-active="1-1"
            @open="handleOpen"
            @close="handleClose"
        >
          <el-sub-menu index="1">
            <template #title>
              <el-icon><Edit /></el-icon>
              <span>内容管理</span>
            </template>
            <el-menu-item index="1-1">
              <span>新闻资讯 </span>
              <NuxtLink to="/console/caselist">嵌套</NuxtLink>
            </el-menu-item>
            <el-menu-item>
              <span>产品信息</span>
            </el-menu-item>
            <el-menu-item>
              <span>资料下载</span>
            </el-menu-item>
            <el-menu-item>
              <span>客户案例</span>
            </el-menu-item>
            <el-menu-item>
              <span>招聘信息</span>
            </el-menu-item>
            <el-menu-item>
              <span>片段管理</span>
            </el-menu-item>
            <el-menu-item>
              <span>组件设置</span>
            </el-menu-item>
          </el-sub-menu>
        </el-menu>
      </el-aside>
      <el-main>
        <NuxtPage></NuxtPage>
      </el-main>
    </el-container>
  </div>


</template>
<style>
body {
  background-image: none;
}

.el-container {
  position: absolute;
  height: 100%;
  width: 100%;
  overflow: hidden;
}

.el-aside {
  height: 100%;
  border-right: solid 1px var(--el-menu-border-color);
}

.el-aside, .el-main {

}

.el-header {
  --el-header-padding: 0px;
}

.el-menu {
  border-right: none;
}
</style>
<script lang="ts" setup>

import {
  Document,
  Menu as IconMenu,
  Location,
  Setting, Edit,
} from '@element-plus/icons-vue'
import Index from "~/pages/console/index.vue";
import Login from "~/layouts/login.vue";
import Caselist from "~/pages/console/caselist.vue";
import { createRouter, createWebHistory } from 'vue-router'

const handleOpen = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
const handleClose = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}


</script>