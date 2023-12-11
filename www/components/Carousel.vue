<template>
  <Carousel class="">
    <Slide v-for="slide in carousels" :key="slide">
      <div class="carousel__item">
        <el-image :src="slide.url" fit="fill"></el-image>
      </div>
    </Slide>
  </Carousel>
</template>
<style>
.flex-grow {
  flex-grow: 1;
}
</style>
<script setup lang="ts">
import { ref } from "vue";
import { Carousel, Navigation, Pagination, Slide } from 'vue3-carousel'

import 'vue3-carousel/dist/carousel.css'

const carousels = ref([
  {url:'/static/images/banner/1.jpg'},
  {url:'/static/images/banner/2.jpg'}
]);

</script>