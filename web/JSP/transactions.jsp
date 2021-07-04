<%--  
    Document   : transactions
    Created on : 16 May, 2020, 2:54:15 PM
    Author     : Promovision
--%>


<%@page import="com.tax.util.BeanObject"%>
<%@page import="java.util.List"%>
<div class="table-wrapper" id="filing_table">
    <div class="table-title">
        <div class="row">
            <div class="col-sm-4">
                <h3>Your Previous <b>Filings</b></h3> 
            </div>
            <div class="col-sm-8">						
                <a href="javascript:;" onclick="showFilingStep1()" class="btn btn-info"><i class="fa fa-plus"></i> <span>New Filing</span></a>
            </div>
        </div>
    </div>
    <!--    <div class="table-filter">
            <div class="row">
                <div class="col-sm-3">
                    <div class="show-entries">
                        <span>Show</span>
                        <select class="form-control">
                            <option>5</option>
                            <option>10</option>
                            <option>15</option>
                            <option>20</option>
                        </select>
                        <span>entries</span>
                    </div>
                </div>
                <div class="col-sm-9">
                    <button type="button" class="btn btn-primary"><i class="fa fa-search"></i></button>
                    <div class="filter-group">
                        <label>Name</label>
                        <input type="text" class="form-control">
                    </div>
                    <div class="filter-group">
                        <label>Location</label>
                        <select class="form-control">
                            <option>All</option>
                            <option>Berlin</option>
                            <option>London</option>
                            <option>Madrid</option>
                            <option>New York</option>
                            <option>Paris</option>								
                        </select>
                    </div>
                    <div class="filter-group">
                        <label>Status</label>
                        <select class="form-control">
                            <option>Any</option>
                            <option>Delivered</option>
                            <option>Shipped</option>
                            <option>Pending</option>
                            <option>Cancelled</option>
                        </select>
                    </div>
                    <span class="filter-icon"><i class="fa fa-filter"></i></span>
                </div>
            </div>
        </div>-->
    <table class="table table-striped table-hover">
        <%
            List filings = null;
            if (request.getAttribute("filings") != null) {
                filings = (List) request.getAttribute("filings");
            }
        %>
        <%if (filings != null && filings.size() > 0) {%>
        <thead>
            <tr>
                <th>#</th>
                <th>Filing No.</th>
                <th>Pan</th>               
                <th>Adhaar</th>
                <th>Mobile Number</th>						
                <th>Attachments</th>						
                <th>Paid Amount</th>
                <th>Status</th>
            </tr>
        </thead>
        <%} else {%>        
        <thead>
            <tr>
                <th>#</th>
                <th>Filing No.</th>
                <th>Pan</th>
                <th>Adhaar</th>
                <th>Mobile Number</th>						
                <th>Attachments</th>						                
                <th>Status</th>
            </tr>
        </thead>
        <%}%>
        <tbody>
            <%if (filings != null && filings.size() > 0) {
                    BeanObject bean = null;
                    for (int y = 0; y < filings.size(); y++) {
                        bean = (BeanObject) filings.get(y);
            %>
            <tr>
                <td><%=(y + 1)%></td>
                <td><%=bean.getStringValue1()%></td>
                <td><%=bean.getStringValue2()%></td>
                <td><%=bean.getStringValue3()%></td>
                <td><%=bean.getStringValue4()%></td>
                <td>--</td>
                <td><%=bean.getStringValue6()%></td>     
                <%if (bean.getStringValue5() != null && bean.getStringValue5().equalsIgnoreCase("Paid")) {%>
                <td><span class="text-success">Paid</span></td>                
                <%} else if (bean.getStringValue5() != null && bean.getStringValue5().equalsIgnoreCase("Pending")) {%>
                <td><span class="text-danger">Failed</span></td>                
                <%}%>
            </tr>
            <%}%>
            <%}%>            
        </tbody>
    </table>
    <div class="clearfix">
        <!--        <div class="hint-text">Showing <b>5</b> out of <b>25</b> entries</div>
                <ul class="pagination">
                    <li class="page-item disabled"><a href="#">Previous</a></li>
                    <li class="page-item"><a href="#" class="page-link">1</a></li>
                    <li class="page-item"><a href="#" class="page-link">2</a></li>
                    <li class="page-item"><a href="#" class="page-link">3</a></li>
                    <li class="page-item active"><a href="#" class="page-link">4</a></li>
                    <li class="page-item"><a href="#" class="page-link">5</a></li>
                    <li class="page-item"><a href="#" class="page-link">6</a></li>
                    <li class="page-item"><a href="#" class="page-link">7</a></li>
                    <li class="page-item"><a href="#" class="page-link">Next</a></li>
                </ul>-->
    </div>
</div>


<script>
    showStepsTax(0);
</script>