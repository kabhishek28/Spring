<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>DUME KSRTC</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>

<div>
    <h1 class="text-center">BUS DEPOT DETAILS</h1>

    <div class="card container text-center mt-5 shadow p-3 mb-5 bg-body-tertiary rounded" style="width: 80rem;">

        <form class="row g-3" action="busDetailsSubmitted" method="post">
            <div class="col-md-6">
                <label for="nameID" class="form-label">Name</label>
                <input type="text" class="form-control" id="nameID" placeholder="Enter Person Name" name="personName">
            </div>

            <div class="col-md-6">
                <label for="emailID" class="form-label">Email</label>
                <input type="email" class="form-control" id="emailID" placeholder="Enter Person Email" name="personEmail">
            </div>
            <div class="col-md-6">
                <label for="phoneNoId" class="form-label">Phone Number</label>
                <input type="number" class="form-control" id="phoneNoId" placeholder="Person Phone no" name="personPhoneNumber">
            </div>

            <div class="col-md-6">
                <label for="ageId" class="form-label"> Age</label>
                <input type="number" class="form-control" id="ageId" placeholder="Person Age" name="personAge">
            </div>

            <div class="col-md-6">
                <label for="inputCity" class="form-label">City</label>
                <input type="text" class="form-control" id="inputCity" placeholder="Enter Person City" name="personCity">
            </div>
            <div class="col-md-4">
                <label for="inputState" class="form-label">State</label>
                <select id="inputState" class="form-select" name="personState">
                    <option selected>Choose...</option>
                    <option value="AP">Andhra Pradesh</option>
                    <option value="AR">Arunachal Pradesh</option>
                    <option value="AS">Assam</option>
                    <option value="BR">Bihar</option>
                    <option value="CG">Chhattisgarh</option>
                    <option value="GA">Goa</option>
                    <option value="GJ">Gujarat</option>
                    <option value="HR">Haryana</option>
                    <option value="HP">Himachal Pradesh</option>
                    <option value="JH">Jharkhand</option>
                    <option value="KA">Karnataka</option>
                    <option value="KL">Kerala</option>
                    <option value="MP">Madhya Pradesh</option>
                    <option value="MH">Maharashtra</option>
                    <option value="MN">Manipur</option>
                    <option value="ML">Meghalaya</option>
                    <option value="MZ">Mizoram</option>
                    <option value="NL">Nagaland</option>
                    <option value="OD">Odisha</option>
                    <option value="PB">Punjab</option>
                    <option value="RJ">Rajasthan</option>
                    <option value="SK">Sikkim</option>
                    <option value="TN">Tamil Nadu</option>
                    <option value="TS">Telangana</option>
                    <option value="TR">Tripura</option>
                    <option value="UP">Uttar Pradesh</option>
                    <option value="UK">Uttarakhand</option>
                    <option value="WB">West Bengal</option>
                    <option value="AN">Andaman and Nicobar Islands</option>
                    <option value="CH">Chandigarh</option>
                    <option value="DN">Dadra and Nagar Haveli and Daman and Diu</option>
                    <option value="DL">Delhi</option>
                    <option value="JK">Jammu and Kashmir</option>
                    <option value="LA">Ladakh</option>
                    <option value="LD">Lakshadweep</option>
                    <option value="PY">Puducherry</option>
                </select>
            </div>



            <div class="col-12">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form>
    </div>

</div>
</body>
</html>