<template>
  <div class="mb-16">

    <Menubar :model="items" />

  </div>
</template>
<style>
.flex-grow {
  flex-grow: 1;
}
</style>
<script setup lang="ts">
import { ref } from "vue";

const items = ref([
  {
    label: '网站首页',
    icon: 'pi pi-home'
  },
  {
    label: '关于我们',
    icon: 'pi pi-star'
  },
  {
    label: '产品展示',
    icon: 'pi pi-star'
  },
  {
    label: '新闻动态',
    icon: 'pi pi-star'
  },
  {
    label: '资料下载',
    icon: 'pi pi-star'
  },
  {
    label: '客户案例',
    icon: 'pi pi-star'
  },
  {
    label: '加入我们',
    icon: 'pi pi-star'
  }
]);
</script>