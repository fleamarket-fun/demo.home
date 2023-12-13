<template>
  <Carousel class="">
    <Slide v-for="slide in carousel.data" :key="slide">
      <div class="carousel__item">
        <el-image :src="slide.imageUrl" fit="fill"></el-image>
      </div>
    </Slide>
    <template #addons>
      <Navigation />
      <Pagination />
    </template>
  </Carousel>
</template>
<style>
.flex-grow {
  flex-grow: 1;
}
</style>
<script setup lang="ts">
import {Carousel, Navigation, Pagination, Slide} from 'vue3-carousel'
import 'vue3-carousel/dist/carousel.css'

const runtimeConfig = useRuntimeConfig()
const {data: carousel} = await useFetch(runtimeConfig.public.apiBase + '/carousel', {'method': 'post'})

</script>