<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <header id="header">
    <nav class="header-top">
      <div class="container">
        <div class="d-flex justify-content-between align-items-center py-3">
          <a class="navbar-brand" href="index.html">
            <img src="images/main-logo.png" class="logo img-fluid">
          </a>
          <ul class="info d-flex flex-wrap justify-content-end align-items-center list-unstyled m-0">
            <li class="phone text-black fw-medium text-capitalize d-flex align-items-center ms-4">
              <svg class="text-primary me-1" width="20" height="20">
                <use xlink:href="#phone"></use>
              </svg> call: 666 333 9999
            </li>
            <li class="time text-black fw-medium text-capitalize d-flex align-items-center ms-4">
              <svg class="text-primary me-1" width="20" height="20">
                <use xlink:href="#clock"></use>
              </svg> 8:00-18:00, Sat: Closed
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <hr class="m-0">
    <nav id="primary-header" class="navbar navbar-expand-lg py-3">
      <div class="container justify-content-end">
        <button class="navbar-toggler d-flex d-lg-none justify-content-end border-0 shadow-none p-0" type="button"
          data-bs-toggle="offcanvas" data-bs-target="#bdNavbar" aria-controls="bdNavbar" aria-expanded="false">
          <svg class="navbar-icon" width="60" height="60">
            <use xlink:href="#navbar-icon"></use>
          </svg>
        </button>
        <div class="header-bottom offcanvas offcanvas-end" id="bdNavbar" aria-labelledby="bdNavbarOffcanvasLabel">
          <div class="offcanvas-header px-4 mt-3 mb-1">
            <button type="button" class="btn-close btn-close-black shadow-none" data-bs-dismiss="offcanvas"
              aria-label="Close" data-bs-target="#bdNavbar"></button>
          </div>
          <div class="offcanvas-body align-items-center justify-content-center">
            <ul class="navbar-nav mb-2 mb-lg-0">
              <li class="nav-item px-3 py-1 py-lg-0">
                <a class="nav-link active p-0" aria-current="page" href="index.html">Home</a>
              </li>
              <li class="nav-item px-3 py-1 py-lg-0 dropdown">
                <a class="nav-link p-0 dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                  aria-expanded="false">pages <svg width="20" height="20" style="vertical-align: sub;">
                    <use xlink:href="#arrow-down"></use>
                  </svg></a>
                <ul class="dropdown-menu dropdown-menu-end animate slide mt-3 border-0 shadow">
                  <li><a href="index.html" class="dropdown-item">About </a>
                  </li>
                  <li><a href="index.html" class="dropdown-item">Blog </a>
                  </li>
                  <li><a href="index.html" class="dropdown-item">Blog-Single </a></li>
                  <li><a href="index.html" class="dropdown-item">Quote </a>
                  </li>
                  <li><a href="index.html" class="dropdown-item">Services </a></li>
                  <li><a href="index.html" class="dropdown-item">Service-Single
                      </a></li>
                  <li><a href="index.html" class="dropdown-item">Project </a></li>
                  <li><a href="index.html" class="dropdown-item">Project-Single
                      </a></li>
                  <li><a href="index.html" class="dropdown-item">Pricing </a></li>
                  <li><a href="index.html" class="dropdown-item">Contact </a></li>
                  <li><a href="index.html" class="dropdown-item">Our Team </a>
                  </li>
                  <li><a href="index.html" class="dropdown-item">Reviews </a></li>
                  <li><a href="index.html" class="dropdown-item">FAQs </a></li>
                </ul>
              </li>
              <li class="nav-item px-3 py-1 py-lg-0">
                <a class="nav-link p-0" href="index.html">About</a>
              </li>
              <li class="nav-item px-3 py-1 py-lg-0">
                <a class="nav-link p-0" href="index.html">Services</a>
              </li>
              <li class="nav-item px-3 py-1 py-lg-0">
                <a class="nav-link p-0" href="index.html">Project</a>
              </li>
               <li class="nav-item px-3 py-1 py-lg-0 dropdown">
                <a class="nav-link p-0 dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                  aria-expanded="false">Customer <svg width="20" height="20" style="vertical-align: sub;">
                    <use xlink:href="#arrow-down"></use>
                  </svg></a>
                <ul class="dropdown-menu dropdown-menu-end animate slide mt-3 border-0 shadow">
                  <li><a href="clogin.jsp" class="dropdown-item">Login </a>
                  </li>
                  <li><a href="cregistration.jsp" class="dropdown-item">Registration </a>
                  </li>
                 
                </ul>
              </li>
              <li class="nav-item px-3 py-1 py-lg-0">
                <a class="nav-link p-0" href="index.html">Contact</a>
              </li>
              <li class="nav-item px-3 py-1 py-lg-0">
                <a class="nav-link p-0" href="index.html">Quote</a>
              </li>
              <li class="nav-item search-dropdown py-3 py-lg-0 ms-3 ms-lg-5 dropdown">
                <a class="nav-link p-0 search dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                  aria-expanded="false">
                  <svg class="search" width="24" height="24">
                    <use xlink:href="#search"></use>
                  </svg>
                </a>
                <ul class="dropdown-menu dropdown-menu-end animate slide mt-3 border-0 p-3 shadow">
                  <li class="position-relative d-flex align-items-center p-0">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-primary position-absolute end-0" type="submit">
                      <svg class="search" width="24" height="24">
                        <use xlink:href="#search"></use>
                      </svg>
                    </button>
                  </li>
                </ul>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </nav>
  </header>
</body>
</html>