<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Blogs</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>

<main>
    <div>
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Blogs</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                        <a class="nav-link active" href="#">Services</a>
                        <a class="nav-link active" href="#">About us</a>
                    </div>
                </div>
            </div>
        </nav>
    </div>
</main>

<body>
<div class=" container d-flex justify-content-center align-items-center mt-5">
    <div class="card text-center mb-3" style="width: 18rem;">
        <div class="card-body">
            <form action="checkChappal" method="post">
                <label for="Brand" class="form-label">Chappal Brand</label>
                <input type="text" id="Brand" class="form-control" name="chappalBrand">

                <label for="Price" class="form-label">Chappal Price</label>
                <input type="number" id="Price" class="form-control" name="chappalPrice">

                <label for="Size" class="form-label">Chappal Size</label>
                <input type="text" id="Size" class="form-control" name="chappalSize">

                <h5 class="card-title">Check Chappal is Available or Not</h5>
                <input class="btn btn-primary" type="submit">
            </form>
        </div>
    </div>
</div>


</body>
</html>