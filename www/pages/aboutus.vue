<template>
  <div class="card flex justify-content-center">
    <Breadcrumb :home="home" :model="items" />
  </div>

  <div class="card">
    <Card>
      <template #content>
        <p class="m-0">
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore sed consequuntur error repudiandae numquam deserunt quisquam repellat libero asperiores earum nam nobis, culpa ratione quam perferendis esse, cupiditate neque
          quas!
        </p>
      </template>
    </Card>
  </div>

</template>
<script setup lang="ts">
import {Breadcrumb, Divider} from "#components";

const home = ref({
  icon: 'pi pi-home'
});
const items = ref([
  { label: '关于我们' }
]);

definePageMeta({
  layout: 'frontend'
})
</script>