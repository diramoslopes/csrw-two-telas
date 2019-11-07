$(document).ready(function(){
	
	$('.js-toggle-menu').bind('click', function(){
		$('.js-sidebar').toggleClass('is-toggle');
		$('.js-content').toggleClass('is-toggle');
	});
	
});

