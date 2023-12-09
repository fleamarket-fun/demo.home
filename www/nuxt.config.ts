// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  devtools: { enabled: true },
  app: {
    head: {
      title: '跳蚤市场：软件应用服务商',
      meta: [
        {name: 'viewport', content: 'width=device-width, initial-scale=1, minimum-scale=1.0, shrink-to-fit=no'},
        {
          name: '跳蚤市场：软件应用服务商',
          content: '跳蚤市场致力于为客户提供一站式应用软件服务，产品有：企业公司网站，社交系统，企业客户关系管理系统，电子商城等。',
        },
      ],
      link: [
        {rel: 'icon', type: 'image/x-icon', href: '/favicon.ico'},
        {rel: 'stylesheet', type:'text/css',media:'all',href: 'static/960grid/css/min/reset.css'},
        {rel: 'stylesheet', type:'text/css',media:'all',href: 'static/960grid/css/min/text.css'},
        {rel: 'stylesheet', type:'text/css',media:'all',href: 'static/960grid/css/min/960.css'},
      ],
      script: [
      ]
    }
  },
  css: ['~/assets/scss/index.scss'],
  modules:[
    '@element-plus/nuxt',
  ]
})