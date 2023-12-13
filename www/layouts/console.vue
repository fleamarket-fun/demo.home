<template>
  <div class="common-layout">
    <el-container>
      <el-aside width="250px">
        <el-row>
          <el-col style="padding: 24px;">
            <table>
              <tr>
                <td rowspan="2">
                  <el-avatar class="mr-6" :size="50"
                             src="https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png"/>
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
            @open="handleOpen"
            @close="handleClose"
            default-openeds="[1]"
        >
          <el-sub-menu index="1">
            <template #title>
              <el-icon>
                <Edit/>
              </el-icon>
              <span>内容管理</span>
            </template>
            <el-menu-item index="1-1">
              <NuxtLink to="/console/newslist"><span>新闻资讯 </span></NuxtLink>
            </el-menu-item>
            <el-menu-item index="1-2">
              <NuxtLink to="/console/productlist"><span>产品信息 </span></NuxtLink>
            </el-menu-item>
            <el-menu-item index="1-3">
              <NuxtLink to="/console/downloadlist"><span>资料下载 </span></NuxtLink>
            </el-menu-item>
            <el-menu-item index="1-4">
              <NuxtLink to="/console/caselist"><span>客户案例 </span></NuxtLink>
            </el-menu-item>
            <el-menu-item index="1-5">
              <NuxtLink to="/console/joblist"><span>招聘信息 </span></NuxtLink>
            </el-menu-item>
            <el-menu-item index="1-6">
              <NuxtLink to="/console/fragmentlist"><span>片段管理 </span></NuxtLink>
            </el-menu-item>
            <el-menu-item index="1-7">
              <NuxtLink to="/console/widgetlist"><span>组件设置 </span></NuxtLink>
            </el-menu-item>
          </el-sub-menu>
          <el-sub-menu index="2">
            <template #title>
              <el-icon>
                <Setting/>
              </el-icon>
              <span>其他设置</span>
            </template>
            <el-menu-item index="2-1">
              <NuxtLink to="/console/system"><span>系统设置 </span></NuxtLink>
            </el-menu-item>
            <el-menu-item index="2-2">
              <NuxtLink to="/console/password"><span>修改密码 </span></NuxtLink>
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
import {createRouter, createWebHistory} from 'vue-router'

const handleOpen = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
const handleClose = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}


</script>