<div>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>id</th>
            <th>Name</th>
            <th>Last Name</th>
            <th>working</th>
            <th>hireDate</th>
            <th>firedDate</th>
        </tr>
        </thead>
        <tbody>
        <tr ng-repeat="employ in employs">
            <td>{{employ.id}}</td>
            <td>{{employ.name}}</td>
            <td>{{employ.lastName}}</td>
            <td>{{employ.working}}</td>
            <td>{{employ.hireDate}}</td>
            <td>{{employ.firedDate}}</td>
        </tr>

        </tbody>
    </table>
</div>