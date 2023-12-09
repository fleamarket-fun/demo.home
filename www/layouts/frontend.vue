<template>
  <div class="box">
    <div class="container_12 page-box">
      <Header></Header>
      <slot/>
      <Footer></Footer>
      <el-backtop :right="100" :bottom="100" />
    </div>
  </div>
</template>
<style>
body{
  background-image: url("/static/images/patterns/az_subtle.png");
}
</style>
<script setup lang="ts">
</script>