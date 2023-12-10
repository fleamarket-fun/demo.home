<template>
  <div class="mb-16">
    <Menubar :model="items" />
    <Carousel>
      <Slide v-for="slide in carousels" :key="slide">
        <div class="carousel__item">
          <el-image :src="slide.url" fit="fill"></el-image>
        </div>
      </Slide>
      <template #addons>
        <Navigation />
        <Pagination />
      </template>
    </Carousel>
  </div>
</template>
<style>
.flex-grow {
  flex-grow: 1;
}
</style>
<script setup lang="ts">
import { ref } from "vue";
import { defineComponent } from 'vue'
import { Carousel, Navigation, Pagination, Slide } from 'vue3-carousel'

import 'vue3-carousel/dist/carousel.css'

const carousels = ref([
  {url:'/static/images/banner/1.jpg'},
  {url:'/static/images/banner/2.jpg'}
]);

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