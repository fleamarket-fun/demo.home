<template>
  <div class="columns-1 my-10 ">
    <p class="text-2xl text-center leading-loose font-black ">新闻资讯</p>
  </div>
  <Divider />

  <div class="flex flex-col space-y-4 ">
    <div class="columns-2">

      <div class="card flex align-items-center justify-content-center">
        <Card>
          <template #title>这是一个标题</template>
          <template #subtitle>2023-12-11</template>
          <template #content>
            <p class="m-0">
              Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore sed consequuntur error repudiandae numquam deserunt quisquam repellat libero asperiores earum nam nobis, culpa ratione quam perferendis esse, cupiditate neque
              quas!
            </p>
          </template>
        </Card>
      </div>

      <div class="card flex align-items-center justify-content-center">
        <Card>
          <template #title>这是一个标题</template>
          <template #subtitle>2023-12-11</template>
          <template #content>
            <p class="m-0">
              Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore sed consequuntur error repudiandae numquam deserunt quisquam repellat libero asperiores earum nam nobis, culpa ratione quam perferendis esse, cupiditate neque
              quas!
            </p>
          </template>
        </Card>
      </div>

    </div>
    <div class="columns-2">

      <div class="card flex align-items-center justify-content-center">
        <Card>
          <template #title>这是一个标题</template>
          <template #subtitle>2023-12-11</template>
          <template #content>
            <p class="m-0">
              Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore sed consequuntur error repudiandae numquam deserunt quisquam repellat libero asperiores earum nam nobis, culpa ratione quam perferendis esse, cupiditate neque
              quas!
            </p>
          </template>
        </Card>
      </div>

      <div class="card flex align-items-center justify-content-center">
        <Card>
          <template #title>这是一个标题</template>
          <template #subtitle>2023-12-11</template>
          <template #content>
            <p class="m-0">
              Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore sed consequuntur error repudiandae numquam deserunt quisquam repellat libero asperiores earum nam nobis, culpa ratione quam perferendis esse, cupiditate neque
              quas!
            </p>
          </template>
        </Card>
      </div>

    </div>
  </div>

</template>
<script setup lang="ts">
import Card from 'primevue/card';
</script>