<template>
  <Carousel class="">
    <Slide v-for="slide in carousel.data" :key="slide">
      <div class="carousel__item">
        <el-image :src="slide.imageUrl" fit="fill"></el-image>
      </div>
    </Slide>
  </Carousel>
  {{ carousel.data }}胜多负少方法是双方都是
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

const runtimeConfig = useRuntimeConfig()

console.log(runtimeConfig)
const { data: carousel } = await useFetch(runtimeConfig.public.apiBase+'/carousel',{'method':'post'})


</script>