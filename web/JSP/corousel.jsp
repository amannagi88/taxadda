<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<div id="demo" class="carousel slide" data-ride="carousel">

    <!-- Indicators -->
    <ul class="carousel-indicators">
        <li data-target="#demo" data-slide-to="0" class="active"></li>
        <li data-target="#demo" data-slide-to="1"></li>
        <li data-target="#demo" data-slide-to="2"></li>
    </ul>

    <!-- The slideshow -->
    <div class="carousel-inner">
        <div class="carousel-item active">

            <img src="img/5_.jpg"  alt = " #"  width="1380px">
            <div class="carousel_text hidden-xs">
                <div class="col-md-12 text-center">

                    <h2>Welcome to <b><bean:message key="welcome.title"></bean:message></b></h2>

                        <br/>
                        <div style="margin-top:15px">                            
                            <a href="<%=request.getContextPath()%>/services.do?Method=services" class="btn btn-primary" style="margin:10px">Services</a>
                        <button type="button" class="btn btn-primary" style="margin:10px">Packages</button>
                        <a href="<%=request.getContextPath()%>/link.do?Method=quickITR" class="btn btn-primary" style="margin:10px">Virtual CFO</a>
                        <button type="button" class="btn btn-primary" style="margin:10px">Request Callback</button>

                    </div>
                </div>
            </div>


        </div>
        <!--        <div class="carousel-item">
                    <img src="img/1_.jpg" alt = "#" width="1380px">            
                </div>
                <div class="carousel-item">
                    <img src="img/2_.jpg" alt = "#" width="1380px">
                </div>-->
    </div>

    <!-- Left and right controls -->
    <a class="carousel-control-prev" href="#demo" data-slide="prev">
        <span class="carousel-control-prev-icon"></span>
    </a>
    <a class="carousel-control-next" href="#demo" data-slide="next">
        <span class="carousel-control-next-icon"></span>
    </a>

</div>