import { writable } from 'svelte/store';


export const menu = writable([
  {
    segment:'dashboard',
    name:"首页",
    icon:'las la-tachometer-alt',
    active_icon:'fas fa-tachometer-alt',
  },
  {
    segment:'project',
    name:"项目",
    icon:'las la-briefcase',
    active_icon:'fas fa-briefcase',
  },
  {
    segment:'device',
    name:"设备",
    icon:'lab la-connectdevelop',
    active_icon:'fab fa-connectdevelop',
  },
  {
    segment:'organization',
    name:"组织",
    icon:'las la-user-friends',
    active_icon:'fas fa-user-friends',
  },
  {
    segment:'gateway',
    name:"网关",
    icon:'las la-sync',
    active_icon:'fas fa-sync',
  },
  {
    segment:'product',
    name:"产品",
    icon:'las la-mobile',
    active_icon:'fas fa-mobile',
  },
]);

