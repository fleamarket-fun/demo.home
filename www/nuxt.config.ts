// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
    devtools: {enabled: false},
    app: {
        head: {
            title: '跳蚤市场：软件应用服务商',
            meta: [
                {name: 'viewport', content: 'width=device-width, initial-scale=1'},
                {
                    name: '跳蚤市场：软件应用服务商',
                    content: '跳蚤市场致力于为客户提供一站式应用软件服务，产品有：企业公司网站，社交系统，企业客户关系管理系统，电子商城等。',
                },
            ],
            link: [
                {rel: 'icon', type: 'image/x-icon', href: '/favicon.ico'},
                {rel: 'stylesheet', type: 'text/css', media: 'all', href: 'static/960grid/css/min/960.css'},
            ],
            script: []
        }
    },
    css: [
        '~/assets/scss/index.scss',
        "primevue/resources/themes/lara-light-amber/theme.css",
        "primeicons/primeicons.css"
    ],
    modules: [
        '@element-plus/nuxt',
        'nuxt-primevue',
        '@nuxtjs/tailwindcss',
        'vue3-carousel-nuxt'
    ],
    primevue: {
        usePrimeVue: true
    },
    vite: {
        css: {
            preprocessorOptions: {
                scss: {
                    additionalData: `@use "@/assets/scss/element/index.scss" as element;`,
                },
            },
        },
    },
    elementPlus: {
        icon: 'ElIcon',
        importStyle: 'scss'
    }
})