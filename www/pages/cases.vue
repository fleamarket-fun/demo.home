<template>
  <div class="card flex justify-content-center">
    <Breadcrumb :home="home" :model="items" />
  </div>
</template>
<script setup lang="ts">

import {Breadcrumb} from "#components";

const home = ref({
  icon: 'pi pi-home'
});
const items = ref([
  { label: '客户案例' }
]);

definePageMeta({
  layout: 'frontend'
})
</script>