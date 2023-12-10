<template>

  <div class="container mx-auto">
    <Header></Header>
    <slot/>
    <Footer></Footer>
    <el-backtop :right="100" :bottom="100" />
  </div>

</template>
<style>
body{
  background-image: url("/static/images/patterns/az_subtle.png");
}
</style>
<script setup lang="ts">
</script>