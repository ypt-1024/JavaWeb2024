<script setup></script>

<template>
  <div>
    <h1>App页面</h1>
    <hr />
    <!-- 1. 路由跳转链接 -->

    <router-link to="/home">home页</router-link> <br />
    <router-link to="/list">list页</router-link> <br />
    <router-link to="/showAll">showAll页</router-link> <br>
    <router-link to="/add">add页</router-link> <br />
    <router-link to="/update">update页</router-link> <br />
    <hr />
    <!-- 2. 路由连接对应视图的展示位置 -->
    <hr />
    默认路由展示:<router-view></router-view>
    <hr />
    Home视图展示:<router-view name="homeView"></router-view>
    <hr />
    List视图展示:<router-view name="listView"></router-view>
    <hr />
    Add视图展示:<router-view name="addView"></router-view>
    <hr />
    Update视图展示:<router-view name="updateView"></router-view>
  </div>
</template>

<style scoped></style>
