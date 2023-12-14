<template>
  <Menubar :model="items" >
    <template #start>
      <Image src="/static/images/logo.png"  alt="Image"   />
    </template>
    <template #item="{ item, props, hasSubmenu, root }">
      <a v-ripple class="flex align-items-center" v-bind="props.action">
        <span class="ml-2">
          <NuxtLink :to="item.route"><span :class="item.icon" /><span v-if="item.icon">&nbsp;</span>{{ item.label }}</NuxtLink>
        </span>
        <Badge v-if="item.badge" :class="{ 'ml-auto': !root, 'ml-2': root }" :value="item.badge" />
        <span v-if="item.shortcut" class="ml-auto border-1 surface-border border-round surface-100 text-xs p-1">{{ item.shortcut }}</span>
        <i v-if="hasSubmenu" :class="['pi pi-angle-down text-primary', { 'pi-angle-down ml-2': root, 'pi-angle-right ml-auto': !root }]"></i>
      </a>
    </template>
  </Menubar>
</template>

<script setup lang="ts">
import { ref } from "vue";
const items = ref([
  {
    label: '网站首页',
    icon: 'pi pi-home',
    route: '/'
  },
  {
    label: '关于我们',
    route: '/aboutus'
  },
  {
    label: '产品展示',
    route: '/product'
  },
  {
    label: '新闻动态',
    route: '/news'
  },
  {
    label: '资料下载',
    route: '/download'
  },
  {
    label: '客户案例',
    route: '/cases'
  },
  {
    label: '加入我们',
    route: '/jobs'
  }
]);
</script>