$(document).ready(function() {

  $('.category_list .category_item[category = "all"]').addClass('ct_item_active');

  $('.category_item').click(function() {
    var catProduct = $(this).attr('category');
    console.log(catProduct);

    $('.category_item').removeClass('ct_item_active');
    $(this).addClass('ct_item_active');

    $('.products-item').hide();

    $('.product-item[category="'+catProduct'"]').show();
  })

$('category_item[category="all"]').click(function()){
  $('.product-item').show();
}

});
