<template>
  <div class="container_12">
    <n-carousel show-arrow>
      <img
          class="carousel-img"
          src="https://naive-ui.oss-cn-beijing.aliyuncs.com/carousel-img/carousel1.jpeg"
      >
      <img
          class="carousel-img"
          src="https://naive-ui.oss-cn-beijing.aliyuncs.com/carousel-img/carousel2.jpeg"
      >
      <img
          class="carousel-img"
          src="https://naive-ui.oss-cn-beijing.aliyuncs.com/carousel-img/carousel3.jpeg"
      >
      <img
          class="carousel-img"
          src="https://naive-ui.oss-cn-beijing.aliyuncs.com/carousel-img/carousel4.jpeg"
      >
    </n-carousel>
  </div>
</template>
<style scoped>
.carousel-img {
  width: 100%;
  height: 240px;
  object-fit: cover;
}
</style>

<script setup lang="ts">
import {NCarousel} from "naive-ui";
</script>