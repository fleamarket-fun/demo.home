<template>
  <Carousel></Carousel>
  <ProductInfo></ProductInfo>
  <AboutUs></AboutUs>
  <SucessfulCases></SucessfulCases>
  <News></News>
</template>
<style scoped>


</style>
<script setup lang="ts">
import {Carousel} from "#components";
import ProductInfo from "~/components/home/ProductInfo.vue";
import AboutUs from "~/components/home/AboutUs.vue";
import SucessfulCases from "~/components/home/SucessfulCases.vue";
import News from "~/components/home/News.vue";

definePageMeta({
  layout: 'frontend'
})
</script>