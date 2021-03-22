

<script>
	import UIForm from '../../uikit/form/UIForm.svelte';
	import UIFormGroup from '../../uikit/form/UIFormGroup.svelte';
	import UITextInput from '../../uikit/form/UITextInput.svelte';
	import UITextPassword from '../../uikit/form/UITextPassword.svelte';
	import UIButton from '../../uikit/form/UIButton.svelte';
	import UILink from '../../uikit/form/UILink.svelte';

	import UiCheckBox from '../../uikit/form/UICheckBox.svelte';
	import LayoutAlignBoth from '../../uikit/layout/LayoutAlignBoth.svelte';
	import server from "../../config/server.js"
	import auth from "../../config/auth.js"

	import { goto } from '@sapper/app';
	import { setContext } from 'svelte';
	import authApi from '../../api/auth.js';

	var form={
		username:"admin",
		password:"admin"
	}



	auth.subscribe(value=>{
		console.log(value);
	})


	function handleSubmit() {
		authApi.login(form).then(ctx=>{
			if(res.code==1){
				alert(res.msg)
			}else{
				window.localStorage.setItem("auth",res.data);
				// auth.setAuth(res.data)
				goto("/dashboard");
			}
		})
}
</script>

<style>
.login_form {
	margin: 0 auto;
	width: 20vw;
}
.option {
	margin:10px 0px;
}
.logo {
	margin-top: 150px;
	margin-bottom: 50px;
	display: flex;
	flex-direction: column;
  justify-content: center;
  justify-items: center;
 	align-items: center;
}
.application_logo {
	margin-bottom: 50px;
}
</style>

<svelte:head>
	<title>用户登录</title>
</svelte:head>


<form class="login_form">
	<div class="logo">
		<img class="application_logo" src="/logo.png" alt="logo" width="64px" height="64px"/>
		<div class="application_name">Fin</div>
	</div>
	<UIForm>
		<UIFormGroup title="账户:">
				<UITextInput  placeholder="邮箱或者电话号码" bind:value={form.username}></UITextInput>
		</UIFormGroup>
		<UIFormGroup title="密码:">
				<UITextPassword placeholder="密码" bind:value={form.password}></UITextPassword>
		</UIFormGroup>
	<div class="option">
		<LayoutAlignBoth style="margin:0px 10px;">
			<UiCheckBox>记住账户</UiCheckBox>
			<UILink href="/auth/forget">找回密码</UILink>
		</LayoutAlignBoth>
	</div>	
		<UIButton on:click={handleSubmit}>登录</UIButton>
		<div class="option">
			<LayoutAlignBoth style="margin:0px 10px;">
				<UILink href="/auth/signup">没有账户?注册一个</UILink>
			</LayoutAlignBoth>
		</div>
	</UIForm>
</form>

