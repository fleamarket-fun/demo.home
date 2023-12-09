<template>
  <Header></Header>
  <slot/>
  <Footer></Footer>
  <n-back-top :right="100" />
</template>
<script setup lang="ts">
import {NBackTop} from "naive-ui";
</script>