/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var transactionId = '';
$(document).ready(function() {    
    _attach__events();

});

function _load__filings() {
    $('#tableDiv').load(ctx + '/link.do?Method=getAllFilings',false);
}

function _attach__events() {
    $('.step2-cls').on("click", function() {
        if (validate_details(1)) {
            _save_open_step_2();
        } else {
            alert("Enter all details")
        }
    });
    $('.custom_btn').on("click", function() {
        if (validate_details(1)) {
            _save_open_step_2();
        } else {
            alert("Enter all details")
        }
    });
    $('.custom_btn1').on("click", function() {
        _save_open_step_3();
    });
    $('.step3-cls').on("click", function() {
        if (validate_details(2)) {
            _open_step_3();
        }
    });
}



function validate_details(level) {
    var err = 0;
    if (level == 1) {
        if ($('.user-pan').val() == '') {
            err++;
        }
        if ($('.user-adhaar').val() == '') {
            err++;
        }
        if ($('.user-mobile').val() == '') {
            err++;
        }
    }
    if (level == 2) {

    }
    if (err > 0) {
        return false;
    }
    return true;
}

function _save_open_step_2() {
    if (transactionId == '') {
        var a = $('.user-pan').val();
        var b = $('.user-adhaar').val();
        var c = $('.user-mobile').val();
        var xhr = new XMLHttpRequest();
        xhr.open('POST', ctx + '/addDetails.do?Method=saveStep1');
        xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
        xhr.onload = function() {
            transactionId = xhr.responseText;
            //$('#transactId').val(transactionId);
            _open_step_2();
        };
        xhr.send('param1=' + a + '&param2=' + b + '&param3=' + c + '');
    } else {
        _open_step_2();
    }
}

function _save_open_step_3() {
    if (transactionId != '') {        
        var xhr = new XMLHttpRequest();
        xhr.open('POST', ctx + '/addDetails.do?Method=saveStep2');
        xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
        xhr.onload = function() {
            //$('#third_div').load(ctx + '/addDetails.do?Method=loadStep3');
            //_open_step_3();
            $('#__make_payment')[0].click();
        };
        xhr.send(null);
    } else {
        _open_step_2();
    }
}

function _open_step_2() {
    $('.step2-cls').removeClass("disabled");
    $('.step2-cls').addClass("complete");
    $('.step3-cls').removeClass("complete");
    $('.step3-cls').addClass("disabled");
    $('#first_div').hide();
    $('#second_div').show();
}

function _open_step_3() {
    $('.step2-cls').removeClass("disabled");
    $('.step2-cls').addClass("complete");
    $('.step3-cls').removeClass("disabled");
    $('.step3-cls').addClass("complete");
    $('#first_div').hide();
    $('#second_div').hide();
    $('#third_div').show();
}