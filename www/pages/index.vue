<template>
  <Carousel></Carousel>
  <ProductInfo></ProductInfo>
  <AboutUs></AboutUs>
  <SucessfulCases></SucessfulCases>
  <News></News>
</template>
<script setup lang="ts">

import ProductInfo from "~/components/home/ProductInfo.vue";
import AboutUs from "~/components/home/AboutUs.vue";
import SucessfulCases from "~/components/home/SucessfulCases.vue";
import News from "~/components/home/News.vue";
import Carousel from "~/components/home/Carousel.vue";

definePageMeta({
  layout: 'frontend'
})
</script>