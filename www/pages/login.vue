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
            <el-form-item label="密&emsp;码" prop="password">
              <el-input v-model="ruleForm.password"/>
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
<script setup lang="ts">
import type { FormInstance, FormRules } from 'element-plus'
import {reactive, ref} from 'vue'

const ruleFormRef = ref<FormInstance>()

const ruleForm = reactive({
  username: '',
  password: ''
})

const rules = reactive<FormRules<ruleForm>>({
  username: [
    {
      required: true,
      message: '用户名为4~16字符之间（中文、字母、数字或下划线）',
      min: 6, max: 18,
      trigger: 'blur',
    }
  ],
  password: [
    {
      required: true,
      message: '密码为6~18位字母、数字和符号',
      min: 6, max: 18,
      trigger: 'blur',
    }
  ]
})

const submitForm = (formEl: FormInstance | undefined) => {
  if (!formEl) return
  formEl.validate((valid) => {
    if (valid) {
      console.log('submit!')
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