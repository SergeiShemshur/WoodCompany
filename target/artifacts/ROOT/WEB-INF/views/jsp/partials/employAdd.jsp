<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>

<div class="center-block">
    <div class="panel panel-info" >
        <div class="panel-heading">Create Employ</div>
        <div class="panel-body">
            <div class="row">
                <div class="col-lg-3">
                </div>
                <form class="col-lg-6 center-block" action="employAdd" method="post" role="form">

                    <div class="form-group">
                        <label class="control-label" for="name">Name</label>
                        <input type="text" name="name" class="form-control" id="name" placeholder="Name">
                        <p class="help-block">Enter employ name</p>
                    </div>

                    <div class="form-group">
                        <label class="control-label" for="lastName">Last name</label>
                        <input type="text" class="form-control" name="lastName" id="lastName"
                               placeholder="Enter last name">
                        <p class="help-block">Enter last name</p>
                    </div>

                    <div class="form-group">
                        <label class="control-label">Gender</label>

                        <div class="radio">
                            <label>
                                <input type="radio" name="gender" id="optionsRadios1" value="man" checked>
                                Man
                            </label>
                        </div>
                        <div class="radio">
                            <label>
                                <input type="radio" name="gender" id="optionsRadios2" value="woman">
                                Woman
                            </label>
                        </div>
                        <p class="help-block">Choose employ gender</p>
                    </div>

                    <div class="form-group">
                        <label class="control-label" for="exampleInputEmail1">Email</label>
                        <input type="email" name="email" class="form-control" id="exampleInputEmail1"
                               placeholder="Enter email">

                        <p class="help-block">Enter email</p>
                    </div>

                    <div class="form-group">
                        <label class="control-label" for="date">Enter hire date</label>
                        <input name="hireDate" type="date" id="date" class="form-control"
                               value="<%= new SimpleDateFormat("yyyy-MM-dd").format(new Date()) %>">
                    </div>


                    <div class="form-group">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox" name="working" value="true"> Working
                            </label>
                        </div>
                        <p class="help-block"></p>
                    </div>

                    <button type="submit" onsubmit="update()" class="btn btn-default">Create employ</button>
                </form>


            </div>
        </div>
    </div>
</div>