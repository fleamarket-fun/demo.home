<template>
  <div class="common-layout">
    <el-container>
      <el-aside width="250px">
        <el-row>
          <el-col style="padding: 24px;">
            <table>
              <tr>
                <td rowspan="2">
                  <el-avatar :size="50" src="https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png"/>
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
            default-active="2"
            @open="handleOpen"
            @close="handleClose"
        >
          <el-sub-menu index="1">
            <template #title>
              <el-icon>
                <location/>
              </el-icon>
              <span>Navigator One</span>
            </template>
            <el-menu-item-group title="Group One">
              <el-menu-item index="1-1">item one</el-menu-item>
              <el-menu-item index="1-2">item two</el-menu-item>
            </el-menu-item-group>
            <el-menu-item-group title="Group Two">
              <el-menu-item index="1-3">item three</el-menu-item>
            </el-menu-item-group>
            <el-sub-menu index="1-4">
              <template #title>item four</template>
              <el-menu-item index="1-4-1">item one</el-menu-item>
            </el-sub-menu>
          </el-sub-menu>
          <el-menu-item index="2">
            <el-icon>
              <icon-menu/>
            </el-icon>
            <span>Navigator Two</span>
          </el-menu-item>
          <el-menu-item index="3" disabled>
            <el-icon>
              <document/>
            </el-icon>
            <span>Navigator Three</span>
          </el-menu-item>
          <el-menu-item index="4">
            <el-icon>
              <setting/>
            </el-icon>
            <span>Navigator Four</span>
          </el-menu-item>
        </el-menu>
      </el-aside>
      <el-main>
        <el-tabs closable type="card">
          <el-tab-pane label="首页" name="first" :closable="false">首页</el-tab-pane>
          <el-tab-pane label="Config" name="second">Config</el-tab-pane>
          <el-tab-pane label="Role" name="third">Role</el-tab-pane>
          <el-tab-pane label="Task" name="fourth">Task</el-tab-pane>
        </el-tabs>
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
  Setting,
} from '@element-plus/icons-vue'

const handleOpen = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
const handleClose = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}


</script>