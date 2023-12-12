<template>

  <div class="container mx-auto px-4 page-box">
    <HeadMenu></HeadMenu>
    <slot></slot>
    <Footer></Footer>
    <ScrollTop
        icon="pi pi-arrow-up"
        :pt="{
            root: 'w-2rem h-2rem border-round-sm bg-orange-400',
            icon: {
                class: 'text-base'
            }
        }"
    />
  </div>

</template>
<style>
body{
  background-image: url("/static/images/patterns/az_subtle.png");
}
</style>
<script setup lang="ts">
import ScrollTop from 'primevue/scrolltop';
import {Footer} from "#components";
import HeadMenu from "~/components/HeadMenu.vue";
</script>