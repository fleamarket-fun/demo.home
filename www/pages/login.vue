<template>
  <el-main>
    <el-row style="margin-top: 10%;">
      <el-col :span="8"></el-col>
      <el-col :span="8">
        <el-card class="box-card">
          <template #header>
            <div class="card-header">
              <span>管理员登录</span>
            </div>
          </template>
          <el-form
              ref="ruleFormRef"
              :model="ruleForm"
              :rules="rules"
              label-position="Right"
          >
            <el-form-item label="用户名" prop="username">
              <el-input v-model="ruleForm.username"/>
            </el-form-item>
            <el-form-item label="密&emsp;码" prop="userpass">
              <el-input type="password" v-model="ruleForm.userpass"/>
            </el-form-item>
          </el-form>
          <template #footer>
            <el-button type="primary" @click="submitForm(ruleFormRef)">登录</el-button>
          </template>
        </el-card>
      </el-col>
      <el-col :span="8"></el-col>
    </el-row>
  </el-main>
</template>
<style>
body {
  background-image: none;
}
</style>
<script setup lang="ts">
import type { FormInstance, FormRules } from 'element-plus'
import {reactive, ref} from 'vue'
import {useLoginStore} from "~/stores/mystore";

const runtimeConfig = useRuntimeConfig()
const ruleFormRef = ref<FormInstance>()

const ruleForm = reactive({
  username: '',
  userpass: ''
})

const rules = reactive<FormRules<ruleForm>>({
  username: [
    {
      required: true,
      message: '登录名是必须的',
      trigger: 'blur',
    }
  ],
  userpass: [
    {
      required: true,
      message: '密码是必须的',
      trigger: 'blur',
    }
  ]
})

const submitForm = (formEl: FormInstance | undefined) => {
  console.log('submit');
  if (!formEl) return
  formEl.validate(async (valid) => {
    if (valid) {
      let data:any = await useFetch(runtimeConfig.public.apiBase + '/user/login', {'method': 'post', body: ruleForm})
      const loginResult = unref(data.data);
      if(loginResult.code==200 && loginResult.data.token!=null){
        useLoginStore().username = loginResult.data.username;
        useLoginStore().token = loginResult.data.token;
        await navigateTo('/console')
      }else{
        ElMessage.error('用户名或者密码不正确')
      }

    } else {
      console.log('error submit!')
      return false
    }
  })
}
definePageMeta({
  layout: 'login'
})
</script>