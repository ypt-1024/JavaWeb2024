<script setup type="module">
const data = {
  name: 'this0',
  url: 'http://www.this0.com',
  logo: 'https://blog-resources.this0.com/base/logo.png',
}
</script>

<template>
  <div>
    <a v-bind:href="data.url" target="_self">
      <img :src="data.logo" :title="data.name" />
      <br />
      <input type="button" :value="`点击访问${data.name}`" />
    </a>
  </div>
</template>

<style scoped></style>
