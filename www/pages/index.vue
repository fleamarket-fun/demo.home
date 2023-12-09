<template>
  <div class="mb-16">
    <el-row >
      <el-col :span="24">
        <n-carousel show-arrow>
          <img class="carousel-img" src="/static/images/banner/1.jpg">
          <img class="carousel-img" src="/static/images/banner/2.jpg">
        </n-carousel>
      </el-col>
    </el-row>
  </div>
  <div class="mb-16">
    <el-row>
      <el-col :span="24">
        <div class="line mb-16" style="border-bottom: 1px solid var(--el-border-color);width: 100%;">
          <el-text class="mx-1" size="large"><strong>产品信息</strong></el-text>
        </div>
        <el-row :gutter="20">
          <el-col :span="6">
            <el-image src="/static/images/product/1.jpg" fit="fill"></el-image>
          </el-col>
          <el-col :span="6">
            <el-image src="/static/images/product/2.jpg" fit="fill"></el-image>
          </el-col>
          <el-col :span="6">
            <el-image src="/static/images/product/3.jpg" fit="fill"></el-image>
          </el-col>
          <el-col :span="6">
            <el-image src="/static/images/product/1.jpg" fit="fill"></el-image>
          </el-col>
        </el-row>
      </el-col>
    </el-row>
  </div>
  <div class="mb-16">
    <el-row>
      <el-col :span="24">
        <div class="line mb-16" style="border-bottom: 1px solid var(--el-border-color);width: 100%;">
          <el-text class="mx-1" size="large"><strong>关于我们</strong></el-text>
        </div>
        <el-row :span="24" :gutter="20">
          <el-col :span="16">
            测试测试
          </el-col>
          <el-col :span="8">
            <el-image src="/static/images/product/1.jpg" fit="fill"></el-image>
          </el-col>
        </el-row>
      </el-col>
    </el-row>
  </div>
  <div class="mb-16">
    <el-row>
      <el-col :span="24">
        <div class="line mb-16" style="border-bottom: 1px solid var(--el-border-color);width: 100%;">
          <el-text class="mx-1" size="large"><strong>成功案例</strong></el-text>
        </div>
        <el-row :gutter="20">
          <el-col :span="6">
            <el-image src="/static/images/product/1.jpg" fit="fill"></el-image>
          </el-col>
          <el-col :span="6">
            <el-image src="/static/images/product/2.jpg" fit="fill"></el-image>
          </el-col>
          <el-col :span="6">
            <el-image src="/static/images/product/3.jpg" fit="fill"></el-image>
          </el-col>
          <el-col :span="6">
            <el-image src="/static/images/product/1.jpg" fit="fill"></el-image>
          </el-col>
        </el-row>
      </el-col>
    </el-row>
  </div>
  <div class="mb-16">
    <el-row>
      <el-col :span="24">
        <div class="line mb-16" style="border-bottom: 1px solid var(--el-border-color);width: 100%;">
          <el-text class="mx-1" size="large"><strong>新闻资讯</strong></el-text>
        </div>
        <el-row :gutter="20">
          <el-col :span="12">
            <n-space vertical>
              <n-card title="小卡片" size="small" >
                <template #header-extra>
                  2023-12-09
                </template>
                手动阀手动阀胜多负少士大夫
              </n-card>
              <n-card title="小卡片" size="small" >
                <template #header-extra>
                  2023-12-09
                </template>
                手动阀手动阀胜多负少士大夫
              </n-card>
            </n-space>
          </el-col>
          <el-col :span="12">
            <n-space vertical>
              <n-card title="小卡片" size="small" >
                <template #header-extra>
                  2023-12-09
                </template>
               手动阀手动阀胜多负少士大夫
              </n-card>
              <n-card title="小卡片" size="small" >
                <template #header-extra>
                  2023-12-09
                </template>
                手动阀手动阀胜多负少士大夫
              </n-card>
            </n-space>
          </el-col>
        </el-row>
      </el-col>
    </el-row>
  </div>
</template>
<style scoped>
.carousel-img {
  width: 100%;
  object-fit: cover;
}

</style>

<script setup lang="ts">
import {NCard, NCarousel, NLayout, NLayoutSider, NSpace, NTabs} from "naive-ui";
definePageMeta({
  layout: 'frontend'
})
</script>