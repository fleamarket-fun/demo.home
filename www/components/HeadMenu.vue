<template>
  <Menubar :model="items" >
    <template #start>
      <Image src="/static/images/logo.png"  alt="Image"   />
    </template>
  </Menubar>
</template>

<script setup lang="ts">
import { ref } from "vue";
const items = ref([
  {
    label: '网站首页',
    icon: 'pi pi-home'
  },
  {
    label: '关于我们',
  },
  {
    label: '产品展示',
  },
  {
    label: '新闻动态',
  },
  {
    label: '资料下载',
  },
  {
    label: '客户案例',
  },
  {
    label: '加入我们',
  }
]);
</script>