<template>
  <el-table :data="tableData" style="width: 100%">
    <el-table-column fixed prop="title" label="标题"/>
    <el-table-column prop="createdTime" label="创建时间" width="200"/>
    <el-table-column fixed="right" label="操作" width="120">
      <template #default>
        <el-button link type="primary" size="small" @click="handleClick"
        >编辑</el-button
        >
        <el-button link type="primary" size="small">删除</el-button>
      </template>
    </el-table-column>
  </el-table>
</template>

<script lang="ts" setup>
const handleClick = () => {
  console.log('click')
}

const tableData = [
  {
    createdTime: '2016-05-03',
    title: 'Tomsdfsdfs胜多负少 胜多负少'
  },
  {
    createdTime: '2016-05-03',
    title: 'Tomsdfsdfs胜多负少 胜多负少'
  },
  {
    createdTime: '2016-05-03',
    title: 'Tomsdfsdfs胜多负少 胜多负少'
  }
]
</script>