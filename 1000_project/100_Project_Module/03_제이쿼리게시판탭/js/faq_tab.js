$(document).ready(function() {
    
    $('.tab_btn li').click(function() {
        var index = $(this).index();
        $('.tab_btn li').removeClass('on');
        $(this).addClass('on');
        $('.tab_contents .list').hide();
        $('.tab_contents .list').eq(index).show();    
    });
    
 
    $('.question').click(function() {
        var answer = $(this).next('.answer');
        answer.slideToggle();
        if ($(this).find('dd').hasClass('down')) {
            $(this).find('dd').removeClass('down').addClass('up');
        } else {
            $(this).find('dd').removeClass('up').addClass('down');
        }
    });
    
});
